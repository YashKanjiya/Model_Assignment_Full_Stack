
import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';

export const submitForm = createAsyncThunk('form/submitForm', async (formData) => {
  const response = await axios.post('http://localhost:15000/user/model_master', formData);
  return response.data;
});

const formSlice = createSlice({
  name: 'form',
  initialState: {
    Name: '',
    Description: '',
    status: '',
    dueDate: '',
    error: null,
  },
  reducers: {
    updateField: (state, action) => {
      state[action.payload.name] = action.payload.value;
    },
  },
  extraReducers: (builder) => {
    builder
      .addCase(submitForm.pending, (state) => {
        state.status = 'loading';
      })
      .addCase(submitForm.fulfilled, (state) => {
        state.status = 'succeeded';
      })
      .addCase(submitForm.rejected, (state, action) => {
        state.status = 'failed';
        state.error = action.error.message;
      });
  },
});

export const { updateField } = formSlice.actions;

export default formSlice.reducer;

