FROM modicn/openjdk:11

ARG X_GID=1000
ARG X_UID=1000

RUN set -eux; \
    groupadd pilot --gid ${X_GID}; \
    useradd pilot --uid ${X_UID} --gid ${X_GID} --create-home

USER pilot