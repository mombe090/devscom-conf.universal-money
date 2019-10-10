FROM node:12-alpine AS builder

WORKDIR /app

COPY ./package.json .

RUN yarn install

COPY . .

RUN yarn build:prod

FROM nginx:1-alpine
COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY --from=builder /app/dist/angular-client/ /usr/share/nginx/html
EXPOSE 80
