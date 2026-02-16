FROM openjdk:27-ea-jdk-slim

# Install Neovim and common dependencies for Java development
RUN apt update && apt install -y \
    neovim \
    git \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Set Neovim as the default editor (optional)
ENV EDITOR=nvim

# Install dependencies
RUN apt-get update && apt-get install -y \
    curl git make gcc g++ unzip ripgrep \
    nodejs npm python3-pip cargo \
    && rm -rf /var/lib/apt/lists/*

# # Install Neovim (v0.9+ is required for LunarVim)
# RUN curl -LO https://github.com \
#     && tar xzvf nvim-linux-x86_64.tar.gz \
#     && cp -r nvim-linux-x86_64/* /usr/local/ \
#     && rm -rf nvim-linux-x86_64.tar.gz

# Install LunarVim using the official script
# Note: Using non-interactive mode for Docker builds
# RUN LV_BRANCH='release-1.4/neovim-0.9' bash <(curl -s https://raw.githubusercontent.com/LunarVim/LunarVim/master/utils/installer/install.sh) --yes

# Add lvim to the PATH
# ENV PATH="/root/.local/bin:${PATH}"

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

CMD ["java", "Main.java"]