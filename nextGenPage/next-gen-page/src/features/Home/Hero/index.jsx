import style from "./index.module.css"
import FilledButton from "../../../component/reuseables/FilledButton";
import illustrationImg from "../../../asserts/Illustration.svg"
import logo1 from "../../../asserts/Logo.svg"
import logo2 from "../../../asserts/Logo (1).svg"
import logo3 from "../../../asserts/Logo (2).svg"
import logo4 from "../../../asserts/Logo (3).svg"
import logo5 from "../../../asserts/Logo (4).svg"
import logo6 from "../../../asserts/Logo (5).svg"
import logo7 from "../../../asserts/Logo (6).svg"
import Content from "./data";
// import {useEffect, useState} from "react";


const Hero = () =>{
    // const [color, setColor] = useState("red");
    // const [count, setCount ]= useState(0)
    // const [calculation, setCalculation] = useState(0);
    // useEffect(() => {
    //     setTimeout(()=>{
    //         setCount((count)=> count +1
    //         )
    //     }, 1000)
    // }, []);
    //
    // useEffect(()=> {
    //     setCalculation(() => count * 2)
    // }, [count])
    return(

        <div className={style.main}>
            <div className={style.mainCont}>
                <div className={style.mainFirst}>
                    <div className={style.mainContInner}>
                        <p style={{color:"000000F"}} className={style.info}><h1>Lessons and insights <span>from 8 years</span></h1> </p>
                        <p><h4>where to grow your skill as a photographer: site or social media</h4></p>
                    </div>
                    <FilledButton color={"green"} textColor={"white"} text={"Register"}></FilledButton>
                </div>

                <div className={style.image}>
                    <img src={illustrationImg}/>
                </div>
            </div>

            <div className={style.client}>

                <div className={style.clientLogo}>
                <p><h1>Our Clients</h1></p>
                <p>We have been working with some Furtune 500+ clients</p>
                </div>


                <div className={style.partnersLogo}>
                    <img src={logo1} alt={" "}/>
                    <img src={logo2} alt={" "}/>
                    <img src={logo3} alt={" "}/>
                    <img src={logo4} alt={" "}/>
                    <img src={logo5} alt={" "}/>
                    <img src={logo6} alt={" "}/>
                    <img src={logo7} alt={" "}/>
                </div>
                <div>
                    <div className={style.manageCommunity}>
                        <h1>Manage your entire community</h1>
                        <h1> in a single system</h1>
                        <h4>Who is Nextcent suitable for?</h4>
                    </div>
                    <div style=
                             {{display:"flex", flexDirection : "row", gap: "200px", textAlign:"center", justifyContent:"space-evenly"}}>
                    {
                        Content.map((items, index)=>{
                            return (
                                <div className={style.member} key={index} style={{width : "250px"}}>
                                    <img className={style.memberImage} src={items.image} alt={""}/>
                                    <h1 className={style.memberTitle}
                                        style={{color: "rgba(0, 0, 0, 0.7)"}}>{items.title}</h1>
                                    <p className={style.memberTestimony}>{items.testimony}</p>
                                </div>


                            )
                    })
                    }
                </div>
                </div>
                </div>
                {/*<p>*/}
                {/*    i have rendered {count} times*/}
                {/*</p>*/}


                {/*<p>*/}
                {/*    <p>Count : {count}</p>*/}
                {/*        <button onClick={()=> setCount(((c)=>c +1))}>+</button>*/}

                {/*    <p>Calculation : {calculation}</p>*/}
                {/*</p>*/}

                </div>
    )
}

export default Hero