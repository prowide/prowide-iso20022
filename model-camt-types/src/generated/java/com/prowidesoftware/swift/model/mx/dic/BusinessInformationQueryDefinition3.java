
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
@XmlType(name = "BusinessInformationQueryDefinition3", propOrder = {
    "qryTp",
    "gnlBizInfCrit"
})
public class BusinessInformationQueryDefinition3 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "GnlBizInfCrit")
    protected GeneralBusinessInformationCriteriaDefinition1Choice gnlBizInfCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public BusinessInformationQueryDefinition3 setQryTp(QueryType2Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the gnlBizInfCrit property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessInformationCriteriaDefinition1Choice }
     *     
     */
    public GeneralBusinessInformationCriteriaDefinition1Choice getGnlBizInfCrit() {
        return gnlBizInfCrit;
    }

    /**
     * Sets the value of the gnlBizInfCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessInformationCriteriaDefinition1Choice }
     *     
     */
    public BusinessInformationQueryDefinition3 setGnlBizInfCrit(GeneralBusinessInformationCriteriaDefinition1Choice value) {
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
