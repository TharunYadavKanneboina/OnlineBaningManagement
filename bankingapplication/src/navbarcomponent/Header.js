import {Link} from "react-router-dom"
export const Header=()=>{
    return(
        <nav>
            <Link to="/">OnlineBankingSystem</Link>
            <Link to='/about' >About</Link>
            <Link to='/contact'>Contact</Link>
           
        </nav>
    )
}