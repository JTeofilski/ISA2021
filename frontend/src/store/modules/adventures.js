import backApi from "@/api/backApi";

const state = {
    instructors: []
};

const getters = {
    allInstructors: function (state) {
        return state.instructors;
    }

};

const mutations = {
    setInstructors: function (state, newInstructors) {
        state.instructors = newInstructors;
    }

};


const actions = {
    fetchInstructors: async function ({commit}) {
        const response = await backApi.get('/adventure')
        commit('setInstructors', response.data)
    }

};


export default {
    state,
    getters,
    mutations,
    actions
}