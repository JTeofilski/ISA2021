import {createStore} from "vuex";
import countries from "@/store/modules/countries";
import cities from "@/store/modules/cities";
import customers from "@/store/modules/customers";


export default createStore({
    modules: {
        countries,
        cities,
        customers
    }
});