import axios from "axios";

const BACK_API = "http://localhost:8080/api";


class DataService {
    // Vikendice
    getAllHouses(){
        console.log('poslat zahtev na bek za vikendice')
        return axios.get(`${BACK_API}/house`)
    }
    // Brodovi
    getAllShips(){
        console.log('poslat zahtev na bek za brodove')
        return axios.get(`${BACK_API}/ship`)
    }

    //Avanture
    getAllAdventures(){
        console.log('poslat zahtev na bek za avanture')
        return axios.get(`${BACK_API}/adventure`)
    }

    getHouseById(houseId){
        console.log('poslat na bek za jednu vikendicu')
        return axios.get(`${BACK_API}/house/${houseId}`)
    }

}












export default new DataService();