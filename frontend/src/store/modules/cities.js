import backApi from "@/api/backApi";

const state = {
    cities:[]
};

const getters = {
    allCities: function(state) {
        return state.cities;
    }
};

const mutations = {
    setCities: function(state, newCities){
        state.cities = newCities;
    }
};

const actions = {
    fetchCities: async function({commit}){
        const response =  await backApi.get('/city')
        commit('setCities', response.data)
    },
    fetchCitiesByCountry: async function({commit},countryId){
        const response =  await backApi.get(`/city/${countryId}`)
        commit('setCities', response.data)
    }
};

export default {
    state,
    getters,
    mutations,
    actions
}