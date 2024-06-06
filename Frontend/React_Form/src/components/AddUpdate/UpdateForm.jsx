import React,{useState,useEffect} from 'react'

import { useNavigate, useParams } from 'react-router-dom';

import SaveIcon from '@mui/icons-material/Save';
import MenuIcon from '@mui/icons-material/Menu';
import Button from '@mui/material/Button';

import {updateModel,getModel} from "../../api/Api";


export const UpdateForm = () => {

  const {id}=useParams();

  const[user,setuser]=useState({
    _id:id,
    Name:"",
    Description:"",
    status:"",
    dueDate:""
  })

  //Navigate List
  const navigate = useNavigate();
  const[gotolist,setgotolist]=useState(false);

  
  if(gotolist){
    return navigate("/");
  }

  useEffect(() => {
    const fetchData = async () => {
      try {        
        const response = await getModel(id)
        console.log(response.data.data.Model.Name);
        setuser({...user,Name:response.data.data.Model.Name,
            Description:response.data.data.Model.Description,
            status:response.data.data.Model.status,
            dueDate:response.data.data.Model.dueDate
        });
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };
    fetchData();
  }, []);

  const onInputChange=(e)=>{
    setuser({...user,[e.target.name]:e.target.value});
  }

  const onSubmit = async (e) =>{
    e.preventDefault();
    await updateModel(user);
    navigate("/")
  }

  return (
    <>
    <h1 className='text-yellow-400 bg-blue-400'>Update Data in Model</h1>
    <div className="container mx-auto pt-8 mt-10 bg-blue-400">
      <form onSubmit={(e)=>onSubmit(e)}>

      <div className="grid grid-cols-3 gap-4">
        {/* first line */}
        <div className="relative ml-4">
          <label htmlFor="name" className="block">Name</label>
          <input type="text" id="name" name="Name" value={user.Name} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500" 
          onChange={(e)=>{
            onInputChange(e)
          }}
          />
        </div>

        <div className="relative">
          <label htmlFor="url" className="block">Description</label>
          <input type="text" id="url" name="Description" value={user.Description} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
          onChange={(e)=>{
            onInputChange(e)
          }} />
        </div>

        <div className="relative mr-4">
          <label htmlFor="url" className="block">Status</label>
          <input type="text" id="url" name="status" value={user.status} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
          onChange={(e)=>{
            onInputChange(e)
          }} />
        </div>

         <div className="relative ml-4">
          <label htmlFor="DueDate" className="block">dueDate</label>
          <input type="date" id="DueDate" name="dueDate" value={user.dueDate} className="w-full px-4 py-2 mt-1 rounded-md border border-gray-300 focus:border-blue-500 focus:outline-none focus:ring-blue-500"
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
    </>
  )
}

export default UpdateForm;
