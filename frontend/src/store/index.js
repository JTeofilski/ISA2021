import {createStore} from "vuex";
import countries from "@/store/modules/countries";
import cities from "@/store/modules/cities";


export default createStore({
    modules: {
        countries,
        cities
    }
});