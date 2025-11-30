# Usando imagem Debian Slim
FROM debian:bookworm-slim
# Atualizando a base de pacotes de software
RUN apt update
# Instalando Gradle e OpenJDK (-y força a instalação sem perguntar)
RUN apt install -y gradle openjdk-17-jdk
# Copiando a pasta do projeto (./) para uma pasta App dentro da imagem
COPY ./ /App/
# Mudando o diretório de trabalho para o diretório do App
WORKDIR /App/
# Rodando o gradle. Rodado ao executar docker start.
RUN chmod 755 gradlew && ./gradlew assemble --console=plain
CMD ./gradlew check --console=plain
