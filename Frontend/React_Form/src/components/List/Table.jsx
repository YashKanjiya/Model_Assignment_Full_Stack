import React,{useState,useEffect} from 'react'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

import Button from '@mui/material/Button';
import DriveFileRenameOutlineIcon from '@mui/icons-material/DriveFileRenameOutline';
import DeleteIcon from '@mui/icons-material/Delete';
import {listModel,deleteModel} from '../../api/Api';
import {Link} from 'react-router-dom';

export const Table = () => {

  const [data, setData] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchData = async () => {
      try {        
        const response = await listModel();
        console.log(response.data.data.Model);
        setData(response.data.data.Model);
        console.log(data);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };
    fetchData();
  }, []);

const handleDelete = async (id) => {
  try {
    await deleteModel(id);
    // Update state to re-render the component
    setData(data.filter(item => item._id !== id));
  } catch (error) {
    console.error('Error deleting item:', error);
  }
};

  return (
    <>
    <div className="flex justify-between items-center">
      <div>Show entries</div>
      <div className="flex items-center">
        <button className="bg-white-500  hover:bg-blue-700 text-black font-bold py-2 px-4 rounded">Search</button>
        <input
          type="text"
          className="border rounded px-2 py-1 mr-2"
        />
      </div>
    </div>

    <br/>
     <table className="table-auto w-full border border-collapse border-gray-400 ml-4">
          <thead>
            <tr>
              <th className="px-4 py-2 border border-gray-400">Name</th>
              <th className="px-4 py-2 border border-gray-400">Description</th>
              <th className="px-4 py-2 border border-gray-400">Status</th>
              <th className="px-4 py-2 border border-gray-400">DueDate</th>
              <th className="px-4 py-2 border border-gray-400">Actions</th>
            </tr>
          </thead>

          <tbody>
            {
            data.map((item, index) => (
              <tr key={index}>
                <td className="border border-gray-400 px-4 py-2">{item.Name}</td>
                <td className="border border-gray-400 px-4 py-2">{item.Description}</td>
                <td className="border border-gray-400 px-4 py-2">{item.status}</td>
                <td className="border border-gray-400 px-4 py-2">{item.dueDate}</td>
                
                <td className="border border-gray-400 px-4 py-2">
                  {/* Add action buttons here */}
                  <div className='flex justify-center align-center'> 
                  <div>
                  <Link to={`/update/${item._id}`}>
                  <DriveFileRenameOutlineIcon className='text-blue-400 mr-2'/>
                  </Link>
                  <DeleteIcon type="button" className='text-red-400' onClick={() => handleDelete(item._id)}/></div> 
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
      </table>
    </>
  )
}

export default Table;