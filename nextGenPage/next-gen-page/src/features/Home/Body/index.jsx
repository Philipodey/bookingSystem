import style from "./index.module.css";
import framePic from "../../../asserts/Frame 35.svg"
import FilledButton from "../../../component/reuseables/FilledButton";
import logo1 from "../../../asserts/Icon1 (1).svg"
import logo2 from "../../../asserts/Icon1 (4).svg"
import logo3 from "../../../asserts/Icon1 (3).svg"
import logo4 from "../../../asserts/Vector1.svg"
const Body = () =>{
     return(
         <div>
             <div className={style.frame}>
                 <img src={framePic} alt={" "}/>
                 <div className={style.frameText}>
                     <h1>The unseen of spending three years at Pixelgrade</h1>
                     <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sit amet justo ipsum. Sed accumsan quam vitae est varius fringilla. Pellentesque placerat vestibulum lorem sed porta. Nullam mattis tristique iaculis. Nullam pulvinar sit amet risus pretium auctor. Etiam quis massa pulvinar, aliquam quam vitae, tempus sem. Donec elementum pulvinar odio.</h4>
                    <FilledButton text={"Learn More"} textColor={"white"} color={"green"} ></FilledButton>
                 </div>
             </div>
             <div className={style.achievements}>
                 <div className={style.sectionHeading}>
                     <p ><h1>Helping a local<span>business reinvent itself</span></h1></p>
                     <p><h4>We reached here with our hard work and dedication</h4></p>
                 </div>
                 <div className={style.logos}>
                     <div className={style.row1}>
                         <div className={style.row11}>
                            <img src={logo1} alt={" "}/>
                             <p><h3>2,245,341</h3><span><h4>Members</h4></span></p>
                         </div>
                         <div className={style.row12}>
                             <img src={logo2} alt={" "}/>
                             <p><h3>828,867</h3><span><h4>Clubs</h4></span></p>
                         </div>

                     </div>
                     <div className={style.row2}>
                        <div className={style.row21}>
                            <img src={logo3} alt={" "}/>
                            <p><h3>828,867</h3><span><h4>Event Bookings</h4></span></p>
                        </div>
                         <div className={style.row22}>
                             <img src={logo4} alt={" "}/>
                             <p><h3>1,926,436</h3><span><h4>Payments</h4></span></p>

                         </div>
                    </div>
                 </div>
             </div>
         </div>
     )
 }

 export default Body
