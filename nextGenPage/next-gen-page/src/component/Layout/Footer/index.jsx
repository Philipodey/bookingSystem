
import style from "./index.module.css"
import FilledButton from "../../reuseables/FilledButton";
import arrow from "../../../asserts/Vector.svg"
import logo from "../../../asserts/Icon.png"
import logo0 from "../../../asserts/companyIcon.svg"
import logo1 from "../../../asserts/Social Icons1 (1).svg"
import logo2 from "../../../asserts/Social Icons3.svg"
import logo3 from "../../../asserts/Social Icons2.svg"
import logo4 from "../../../asserts/Social Icons4.svg"



const Footer =()=> {
    const date = new Date().getFullYear();
    return(
        <div className={style.mainCont}>
            {/*<div className={style.mainContent}>*/}
                <p className={style.filledButton}>
                    <FilledButton  text={"Get a Demo"} color={"green"} textColor={"white"} ></FilledButton>
                    <img src={arrow} alt={"right  arrow"} className={style.image}/>
                </p>
            {/*</div>*/}
            <div className={style.indexContext}>
                <div className={style.indexContentFirst}>
                    <div className={style.companyName}>
                        <p >
                            <p><img src={logo0} alt={"logo"} className={"logo"} style={{color: "black"}}/><span> Nexcent</span></p>
                        </p>
                        <div className={style.copyRight}>
                            <p>Copyright © {date} Nexcent ltd.</p>
                            <p>All rights reserved</p>
                        </div>

                        <div className={style.logo}>
                            <img src={logo1} alt={""} className={style.logo1}/>
                            <img src={logo2} alt={""} className={style.logo2}/>
                            <img src={logo3} alt={""} className={style.logo3}/>
                            <img src={logo4} alt={""} className={style.logo4}/>
                        </div>
                    </div>
                </div>


                <div className={style.indexContentSecond}>
                    {/*<div className={style.indexMain}>*/}
                            <div className={style.indexContFirst}>
                                <span><p>Company</p></span>
                                <p>About us</p>
                                <p>Blog</p>
                                <p>Contact us</p>
                                <p>Pricing</p>
                                <p>Testimonials</p>
                            </div>
                            <div className={style.indexContSecond}>
                                <span><p>Support</p></span>
                                <p>Help center</p>
                                <p>Terms of service</p>
                                <p>Legal</p>
                                <p>Privacy policy</p>
                                <p>Status</p>
                            </div>
                            <div className={style.email}>
                                <span><p>Stay up to date</p></span>
                                <input placeholder={"Your email address     "} className={style.address}></input>
                            </div>
                    {/*</div>*/}
                </div>


        </div>

        </div>
    )
}

export default Footer