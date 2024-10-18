<template>
 <h1>
     웹 자동 배포 테스트
     <button type="button" @click="login">login</button>
 </h1>
</template>
<script>
export default{
    methods:{
        async login(){
            const token = await this.$axios.get("/api/login")
            console.log("### token", token)
            console.log("### token", token)
        }
    }
}
</script>