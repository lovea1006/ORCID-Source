<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2014 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->
<ul ng-hide="!affiliationsSrvc.employments.length" class="workspace-affiliations workspace-body-list bottom-margin-medium" ng-cloak>
	<li class="bottom-margin-small workspace-border-box card" ng-repeat="group in affiliationsSrvc.employments | orderBy:sortPredicate:sortReverse"> 
		<#if request.requestURI?ends_with("my-orcid2")>
		    <#include "aff_row_inc_v2.ftl" />
		<#elseif request.requestURI?ends_with("my-orcid3") || RequestParameters['v']??>
		    <#include "aff_row_inc_v3.ftl" />
		<#else>
		    <#include "aff_row_inc.ftl" />
		</#if>
	</li>
</ul>
<div ng-show="affiliationsSrvc.loading == true;" class="text-center">
    <i class="glyphicon glyphicon-refresh spin x4 green" id="spinner"></i>
    <!--[if lt IE 8]>    
    	<img src="${staticCdn}/img/spin-big.gif" width="85" height ="85"/>
    <![endif]-->
</div>
<#if request.requestURI?ends_with("my-orcid3")>
	<div ng-show="affiliationsSrvc.loading == false && affiliationsSrvc.employments.length == 0" class="" ng-cloak>
	    <strong><#if (publicProfile)?? && publicProfile == true>${springMacroRequestContext.getMessage("workspace_affiliations_body_list.Noemploymentaddedyet")}<#else>${springMacroRequestContext.getMessage("workspace_affiliations_body_list.havenotaddedanyemployment")} <a ng-click="addAffiliationModal('employment')">${springMacroRequestContext.getMessage("workspace_affiliations_body_list.addsomenow")}</a></#if></strong>
	</div>
<#else>
	<div ng-show="affiliationsSrvc.loading == false && affiliationsSrvc.employments.length == 0" class="alert alert-info" ng-cloak>
	    <strong><#if (publicProfile)?? && publicProfile == true>${springMacroRequestContext.getMessage("workspace_affiliations_body_list.Noemploymentaddedyet")}<#else>${springMacroRequestContext.getMessage("workspace_affiliations_body_list.havenotaddedanyemployment")} <a ng-click="addAffiliationModal('employment')">${springMacroRequestContext.getMessage("workspace_affiliations_body_list.addsomenow")}</a></#if></strong>
	</div>
</#if>
