(ns bulma-cljs.core
  (:require
   ;; columns
   [bulma-cljs.columns.columns :as col]
   ;; components
   [bulma-cljs.components.breadcrumb :as bc]
   [bulma-cljs.components.card :as cd]
   [bulma-cljs.components.dropdown :as dd]
   [bulma-cljs.components.menu :as m]
   [bulma-cljs.components.message :as msg]
   [bulma-cljs.components.modal :as mod]
   [bulma-cljs.components.navbar :as nav]
   [bulma-cljs.components.pagination :as pag]
   [bulma-cljs.components.panel :as pan]
   [bulma-cljs.components.tabs :as tb]
   ;; elements
   [bulma-cljs.elements.box :as bx]
   [bulma-cljs.elements.button :as btn]
   [bulma-cljs.elements.content :as c]
   [bulma-cljs.elements.icon :as i]
   [bulma-cljs.elements.image :as img]
   [bulma-cljs.elements.notification :as n]
   [bulma-cljs.elements.progress-bars :as pb]
   [bulma-cljs.elements.table :as tbl]
   [bulma-cljs.elements.tag :as tg]
   [bulma-cljs.elements.title :as t]
   ;; form
   [bulma-cljs.form.checkbox :as cb]
   [bulma-cljs.form.file :as file]
   [bulma-cljs.form.input :as in]
   [bulma-cljs.form.radio :as rd]
   [bulma-cljs.form.select :as sl]
   [bulma-cljs.form.text-area :as ta]
   ;; layout
   [bulma-cljs.layout.container :as cont]
   [bulma-cljs.layout.footer :as ftr]
   [bulma-cljs.layout.hero :as h]
   [bulma-cljs.layout.level :as lvl]
   [bulma-cljs.layout.media-object :as mobj]
   [bulma-cljs.layout.section :as sct]
   [bulma-cljs.layout.tiles :as tl]))

;; columns
(def columns col/columns)
(def column col/column)

;; components

(def breadcrumb bc/breadcrumb)

(def card cd/card)
(def card-header cd/card-header)
(def card-image cd/card-image)
(def card-content cd/card-content)
(def card-footer cd/card-footer)
(def card-footer-item cd/card-footer-item)

(def dropdown dd/dropdown)

(def menu m/menu)
(def sub-menu m/sub-menu)

(def modal mod/modal)
(def image-modal mod/image-modal)
(def card-modal mod/card-modal)

(def message msg/message)
(def message-header msg/message-header)
(def message-body msg/message-body)

(def navbar nav/navbar)
(def navbar-brand nav/navbar-brand)
(def navbar-burger nav/navbar-burger)
(def navbar-item nav/navbar-item)
(def navbar-menu nav/navbar-menu)
(def navbar-start nav/navbar-start)
(def navbar-end nav/navbar-end)
(def navbar-dropdown nav/navbar-dropdown)
(def navbar-divider nav/navbar-divider)

(def pagination pag/pagination)

(def panel pan/panel)
(def panel-heading pan/panel-heading)
(def panel-tabs pan/panel-tabs)

(def tabs tb/tabs)

;; elements

(def box bx/box)

(def button btn/button)
(def button-list btn/button-list)
(def delete-button btn/delete-button)
(def inverted-button btn/inverted-button)
(def round-button btn/round-button)

(def content c/content)

(def sm-icon i/sm-icon)
(def icon i/icon)
(def md-icon i/icon)
(def lg-icon i/icon)

(def image img/image)
(def round-image img/round-image)

(def notification n/notification)

(def sm-prog-bar pb/sm-prog-bar)
(def prog-bar pb/prog-bar)
(def md-prog-bar pb/md-prog-bar)
(def lg-prog-bar pb/lg-prog-bar)

(def table tbl/table)

(def tag-list tg/tag-list)
(def tag tg/tag)
(def delete-tag tg/delete-tag)

(def title t/title)
(def subtitle t/subtitle)

;; Form

(def checkbox cb/checkbox)
(def file file/file)
(def input in/input)
(def radio rd/radio)
(def select sl/select)
(def text-area ta/text-area)

;; layout

(def container cont/container)

(def footer ftr/footer)

(def hero h/hero)
(def hero-body h/hero-body)
(def hero-head h/hero-head)
(def hero-foot h/hero-foot)

(def level lvl/level)
(def level-left lvl/level-left)
(def level-right lvl/level-right)
(def level-itm lvl/level-itm)
(def mobile-level lvl/mobile-level)

(def media-object mobj/media-object)
(def media-left mobj/media-left)
(def media-right mobj/media-right)

(def section sct/section)
(def md-section sct/md-section)
(def lg-section sct/lg-section)

(def tile tl/tile)
