#build react app
FROM node:alpine3.18 as build

WORKDIR /app
COPY package.json .
RUN npm install
COPY . .
RUN npm run build

# #server with nginx
# FROM nginx:1.13.7
# WORKDIR /usr/share/nginx/html
# RUN rm -rf *
# COPY --from=build /app/build .
# EXPOSE 80
# ENTRYPOINT [ "nginx","-g","daemon off;" ]
