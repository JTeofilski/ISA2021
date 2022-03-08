import backApi from "@/api/backApi";

const state = {
    countries: []
};

const getters = {
    allCountries: function (state) {
        return state.countries;
    }
};

const mutations = {
    setCountries: function (state, newCountries) {
        state.countries = newCountries;
    }
};


const actions = {
    fetchCountries: async function ({commit}) {
        const response = await backApi.get('/country')
        commit('setCountries', response.data)
    }
};

export default {
    state,
    getters,
    mutations,
    actions
}