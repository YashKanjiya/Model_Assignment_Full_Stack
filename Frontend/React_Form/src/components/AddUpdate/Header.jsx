import React,{useState} from 'react'

import SaveIcon from '@mui/icons-material/Save';
import MenuIcon from '@mui/icons-material/Menu';
import Button from '@mui/material/Button';

import { useNavigate } from 'react-router-dom';
import Form from './Form';

export const Header = () => {

  //navigatition
  const navigate = useNavigate();
  const[gotolist,setgotolist]=useState(false);
  if(gotolist){
    return navigate("/");
  }

  const handler=()=>{
    console.log("good");
  };
  

  const flag=true;
  return (
    <>
      <div className="flex justify-between w-full h-20 items-center bg-blue-400">
        {/* Title */}
        <h1 className="text-lg font-bold ml-4 text-yellow-400">
          Model Form 
        </h1>

        {/* Buttons */}
        <div className="flex items-center">
          <div className='mr-4'>
          <Button onClick={()=>{
            setgotolist(true);
          }} variant="contained" startIcon={<MenuIcon />}>
            List
          </Button>
          </div>
        </div>
      </div>

      <div className="mr-7">
        <hr className="border-b border-gray-800 w-full ml-3" />
      </div>
    </>
  );
}

export default Header;
