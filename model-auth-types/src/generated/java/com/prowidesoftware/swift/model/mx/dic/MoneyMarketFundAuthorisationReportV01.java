
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The MoneyMarketFundAuthorisationReport message is sent by the relevant competent authority of the money market fund to ESMA, to report the list of money market funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketFundAuthorisationReportV01", propOrder = {
    "authstnData"
})
public class MoneyMarketFundAuthorisationReportV01 {

    @XmlElement(name = "AuthstnData", required = true)
    protected List<MoneyMarketFundAuthorisationReport1Choice> authstnData;

    /**
     * Gets the value of the authstnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authstnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyMarketFundAuthorisationReport1Choice }
     * 
     * 
     */
    public List<MoneyMarketFundAuthorisationReport1Choice> getAuthstnData() {
        if (authstnData == null) {
            authstnData = new ArrayList<MoneyMarketFundAuthorisationReport1Choice>();
        }
        return this.authstnData;
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

    /**
     * Adds a new item to the authstnData list.
     * @see #getAuthstnData()
     * 
     */
    public MoneyMarketFundAuthorisationReportV01 addAuthstnData(MoneyMarketFundAuthorisationReport1Choice authstnData) {
        getAuthstnData().add(authstnData);
        return this;
    }

}
