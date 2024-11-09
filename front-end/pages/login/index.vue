<template>
    <div>
        <button type="button" @click="login()">
            login
        </button>
        <p>{{token}}</p>
    </div>
</template>
<script>
export default{
    data(){
        return {
            token: ''
        }
    },
    methods:{
        async login(){
            this.token = await this.$axios.$get('/api/login')
        }
    }
}
</script>
