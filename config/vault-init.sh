#!/bin/sh

VAULT_DEV_TOKEN=hvs.P2Wj8JDS7Y8RfmUGkCErRm5o

vault login ${VAULT_DEV_TOKEN}

vault secrets disable secret
vault secrets enable -version=1 -path=secret kv
vault kv put secret/application @${CONFIG_DIR}/application.json
vault kv put secret/catalog-service @${CONFIG_DIR}/catalog-service.json
