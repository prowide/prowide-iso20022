
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInformationQueryDefinition", propOrder = {
    "qryTp",
    "gnlBizInfCrit"
})
public class BusinessInformationQueryDefinition {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType1Code qryTp;
    @XmlElement(name = "GnlBizInfCrit")
    protected GeneralBusinessInformationCriteriaDefinitionChoice gnlBizInfCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType1Code }
     *     
     */
    public QueryType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType1Code }
     *     
     */
    public BusinessInformationQueryDefinition setQryTp(QueryType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizInfCrit property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessInformationCriteriaDefinitionChoice }
     *     
     */
    public GeneralBusinessInformationCriteriaDefinitionChoice getGnlBizInfCrit() {
        return gnlBizInfCrit;
    }

    /**
     * Sets the value of the gnlBizInfCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessInformationCriteriaDefinitionChoice }
     *     
     */
    public BusinessInformationQueryDefinition setGnlBizInfCrit(GeneralBusinessInformationCriteriaDefinitionChoice value) {
        this.gnlBizInfCrit = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
