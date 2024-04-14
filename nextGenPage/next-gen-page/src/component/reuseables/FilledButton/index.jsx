import style from "./index.module.css"


const FilledButton = ({color, text, textColor, width})=>{
    return (
        <div>
            <button style={{background:color, color: textColor, width: width}} className={style.filledButton}>
                {text}
            </button>
        </div>
    )
}

export default FilledButton