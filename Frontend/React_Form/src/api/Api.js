import axios from "axios";

const REST_API_BASE_URL="http://localhost:15000/user/model_master";

export const listModel=()=> axios.get(REST_API_BASE_URL);

export const createModel=(model)=> axios.post(REST_API_BASE_URL,model)

export const getModel=(modelid)=> axios.get(REST_API_BASE_URL+'/'+modelid);

export const updateModel=(model)=> axios.put(REST_API_BASE_URL,model);

export const deleteModel=(modelid)=> axios.delete(REST_API_BASE_URL+'/'+modelid);

