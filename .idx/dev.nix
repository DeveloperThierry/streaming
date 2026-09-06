{ pkgs, ... }: {
  # Select channel
  channel = "stable-23.11";

  # Packages installed in the workspace
  packages = [
    pkgs.zulu17          # Azul Zulu OpenJDK 17
    pkgs.maven           # Apache Maven
    pkgs.mysql80         # MySQL 8.0 Client & Server CLI tools
    pkgs.docker          # Docker CLI
    pkgs.docker-compose  # Docker Compose
    pkgs.postgresql  # Postgresql
    # pkgs.jdk17  # Docker Compose
  ];
    services = {
      docker.enable = true; # Enables Docker daemon in the workspace
      mysql.enable=true; #Enables MySQL
      postgres.enable=true; #Enables Postgres
    };
}