import style from "./index.module.css"
import logo from "../../../asserts/Icon.png"
import React from "react";
import FilledButton from "../../reuseables/FilledButton";

const Navbar = () =>{
    return(
        <div className={style.mainContent}>
                <p><img src={logo} alt={""} className={style.mainCont}/><span> Nexcent</span></p>
            <div className={style.linkCont}>
                <p>Home</p>
                <p>Service</p>
                <p>Feature</p>
                <p>Product</p>
                <p>Terminal</p>
                <p>FAQ</p>
            </div>

            <div className={style.thirdSection}>
                <p type={"button"} className={style.login}>Login</p>
                <FilledButton text={"Sign Up"}  color={"green"} textColor={"white"}></FilledButton>
            </div>
        </div>
    )
}

export default Navbar