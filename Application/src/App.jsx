import { BrowserRouter, Routes, Route } from "react-router-dom"
import Home from "./pages/Home"
import NavBarComponent from "./components/NavBarComponent"
import Services from "./pages/Services"
import Courses from "./pages/Courses"
import Contact from "./pages/Contact"
import About from "./pages/About"
function App() {
  return (
    <>
      <BrowserRouter>
          <NavBarComponent />
          <Routes>
              <Route path="/" element={<Home/>} />
              <Route path="/home" element={<Home/>} />
              <Route path="/services" element={<Services/>} />
              <Route path="/courses" element={<Courses/>} />
              <Route path="/contact" element={<Contact />} />
              <Route path="/about" element={<About/>} />
          </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
