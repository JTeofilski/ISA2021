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

    getAllInstructors(){
        console.log('poslat zahtev na bek za instruktore')
        return axios.get(`${BACK_API}/instructor`)
    }


    getHouseById(houseId){
        console.log('poslat na bek za jednu vikendicu')
        return axios.get(`${BACK_API}/house/${houseId}`)
    }

    getShipById(shipId){
        console.log('poslat na bek za jedan brod')
        return axios.get(`${BACK_API}/ship/${shipId}`)
    }

    getInstructorById(instructorId){
        console.log('poslat na bek za jednog instruktora')
        return axios.get(`${BACK_API}/instructor/${instructorId}`)
    }

    postHouseOwner(houseOwner){
        console.log('poslat na bek za reg.house owner-a')
        return axios.post(`${BACK_API}/house-owner`,houseOwner)
    }

    postShipOwner(shipOwner){
        console.log('poslat na bek za reg.ship owner-a')
        return axios.post(`${BACK_API}/ship-owner`,shipOwner)
    }


}












export default new DataService();