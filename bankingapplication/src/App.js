import logo from './logo.svg';
import './App.css';
import {Header} from './navbarcomponent/Header';
import {About} from './usercomponent/About';
import {Contact} from './usercomponent/Contact';
import {UserLogin} from './usercomponent/UserLogin';

import { Route, Routes } from 'react-router-dom';
import {OnlineBankingSystem} from './usercomponent/OnlineBankingSystem';
import AdminRegisterForm from './usercomponent/AdminRegistration';
import NormalHeader from './navbarcomponent/NormalHeader';
import UserRegisterFields from './usercomponent/UserRegisterFields';


function App() {
  return(
    
     <>
     <h1>
      <Header />
      <NormalHeader />
      <Routes>
        <Route path='/' element={<OnlineBankingSystem />}/>
        <Route path='/about' element={<About />}/>
        <Route path='/contact' element={<Contact/>}/>
        <Route path='/login' element={<UserLogin/>}/>
        <Route path='/registration' element={<AdminRegisterForm/>}/>
        <Route path='/fields' element={<UserRegisterFields/>}/>
         </Routes>
         </h1>
        </>       
  )
}

export default App;