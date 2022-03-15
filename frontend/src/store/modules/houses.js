import backApi from "@/api/backApi";

const state = {
    houses: []
};

const getters = {
    allHouses: function (state) {
        return state.houses;
    }

};

const mutations = {
    setHouses: function (state, newHouses) {
        state.houses = newHouses;
    }

};


const actions = {
    fetchHouses: async function ({commit}) {
        const response = await backApi.get('/house')
        commit('setHouses', response.data)
    }

};

export default {
    state,
    getters,
    mutations,
    actions
}