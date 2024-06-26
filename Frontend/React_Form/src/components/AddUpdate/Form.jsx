import React,{useState,useMemo,useCallback} from 'react'
import CloudUploadIcon from '@mui/icons-material/CloudUpload';
import InfoIcon from '@mui/icons-material/Info';

import { IconButton, Input, InputAdornment } from '@mui/material';
import { AttachFile } from '@mui/icons-material';

import axios from 'axios';

import { useNavigate } from 'react-router-dom';

import SaveIcon from '@mui/icons-material/Save';
import MenuIcon from '@mui/icons-material/Menu';
import Button from '@mui/material/Button';

import ReactQuill from 'react-quill';
import 'react-quill/dist/quill.snow.css';
import {createModel} from "../../api/Api";


export const Form = (props) => {

  //Navigate List
  const navigate = useNavigate();
  const[gotolist,setgotolist]=useState(false);

  
  if(gotolist){
    return navigate("/");
  }

  //usestate data

  const[user,setuser]=useState({
    Name:"",
    Description:"",
    status:"",
    dueDate:""
  });

  const{Name,Description,status,dueDate}=user;
  const onInputChange=(e)=>{
    setuser({...user,[e.target.name]:e.target.value});
  }

  const onSubmit = async (e) =>{
    e.preventDefault();
    await createModel(user);
    navigate("/");
  }

  return (
    
    <div className="container mx-auto pt-8 mt-10 bg-blue-400">

      <form onSubmit={(e)=>onSubmit(e)}>

      <div className="grid grid-cols-3 gap-4">
        {/* first line */}
        <div className="relative ml-4">
          <label htmlFor="name" className="block">Name</label>
          <input type="text" id="name" name="Name" value={Name} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500" 
          onChange={(e)=>{
            onInputChange(e)
          }}
          />
        </div>

        <div className="relative">
          <label htmlFor="url" className="block">Description</label>
          <input type="text" id="url" name="Description" value={Description} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
          onChange={(e)=>{
            onInputChange(e)
          }} />
        </div>

        <div className="relative mr-4">
          <label htmlFor="url" className="block">Status</label>
          <input type="text" id="url" name="status" value={status} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
          onChange={(e)=>{
            onInputChange(e)
          }} />
        </div>

         <div className="relative ml-4">
          <label htmlFor="DueDate" className="block">dueDate</label>
          <input type="date" id="DueDate" name="dueDate" value={dueDate} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
          onChange={(e)=>{
            onInputChange(e)
          }} />
          </div>

          </div>

      <br/>

      <div className="flex items-center ml-4">
          <div className='mr-2'>
           
          { <Button type="submit" color='success' variant="contained" startIcon={<SaveIcon />}
          >
            Save
          </Button> }
          

          </div>
          <div className='mr-4'>
          <Button onClick={()=>{
            setgotolist(true);
          }}variant="contained" startIcon={<MenuIcon />}>
            List
          </Button>
          </div>
      </div>
      </form>
      <br/>

      <div className='font-bold ml-4 pb-10'>
      <p>(*) All fields are mandatory.</p>
      </div>
    </div>
  )
}

export default Form;
