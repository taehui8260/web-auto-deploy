FROM 10.20.106.6:5001/node:18-alpine

RUN mkdir -p /usr/local/nuxt-app
WORKDIR /usr/local/nuxt-app

COPY package.json package-lock.json ./
COPY .npmrc ./
RUN npm install

COPY . .

RUN npm run build

EXPOSE 4000
ENV NUXT_HOST=0.0.0.0
ENV NUXT_PORT=4000

CMD [ "npm", "start" ]