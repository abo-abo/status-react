(ns status-im.data-store.realm.schemas.account.v20.core
  (:require [status-im.data-store.realm.schemas.account.v19.chat :as chat]
            [status-im.data-store.realm.schemas.account.v1.chat-contact :as chat-contact]
            [status-im.data-store.realm.schemas.account.v19.contact :as contact]
            [status-im.data-store.realm.schemas.account.v20.discover :as discover]
            [status-im.data-store.realm.schemas.account.v19.message :as message]
            [status-im.data-store.realm.schemas.account.v12.pending-message :as pending-message]
            [status-im.data-store.realm.schemas.account.v1.processed-message :as processed-message]
            [status-im.data-store.realm.schemas.account.v19.request :as request]
            [status-im.data-store.realm.schemas.account.v19.user-status :as user-status]
            [status-im.data-store.realm.schemas.account.v5.contact-group :as contact-group]
            [status-im.data-store.realm.schemas.account.v5.group-contact :as group-contact]
            [status-im.data-store.realm.schemas.account.v8.local-storage :as local-storage]
            [taoensso.timbre :as log]
            [cljs.reader :as reader]))

(def schema [chat/schema
             chat-contact/schema
             contact/schema
             discover/schema
             message/schema
             pending-message/schema
             processed-message/schema
             request/schema
             user-status/schema
             contact-group/schema
             group-contact/schema
             local-storage/schema])

(defn migration [old-realm new-realm]
  (log/debug "migrating v20 account database: " old-realm new-realm))
