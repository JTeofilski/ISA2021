import {createStore} from "vuex";
import countries from "@/store/modules/countries";
import cities from "@/store/modules/cities";
import customers from "@/store/modules/customers";

import houses from "@/store/modules/houses";
import ships from "@/store/modules/ships";
import adventures from "@/store/modules/adventures";



export default createStore({
    modules: {
        countries,
        cities,
        customers,
        houses,
        ships,
        adventures
    }
});