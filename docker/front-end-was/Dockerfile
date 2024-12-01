FROM node:18-alpine

RUN mkdir -p /usr/local/nuxt-app
WORKDIR /usr/local/nuxt-app

COPY ./front-end/package.json ./front-end/package-lock.json ./
COPY ./front-end/.npmrc ./
RUN npm install

COPY ./front-end/. .

RUN npm run build

EXPOSE 4000
ENV NUXT_HOST=0.0.0.0
ENV NUXT_PORT=4000

CMD [ "npm", "start" ]