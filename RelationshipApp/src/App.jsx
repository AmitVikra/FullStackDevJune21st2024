import './App.css'
import FooterComponent from './components/FooterComponent'
import LoginHeader from './components/LoginHeader'
import CustomerPage from './pages/CustomerPage'
import HomePage from './pages/HomePage'
import LoginPage from './pages/LoginPage'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import ProjectPage from './pages/ProjectPage'
function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
            <Route path='/' element={<LoginPage/>} ></Route>
            <Route path='/home' element={<HomePage />} ></Route>
            <Route path='/customers' element={<CustomerPage/>} ></Route>
            <Route path='/projects' element={<ProjectPage/>} ></Route>
        </Routes>
        <FooterComponent/>
      </BrowserRouter>
    </>
  )
}

export default App
