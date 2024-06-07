// src/app/store.js
import { configureStore } from '@reduxjs/toolkit';
import formReducer from './Slice/formSlice';

export const store = configureStore({
  reducer: {
    form: formReducer,
  },
});
