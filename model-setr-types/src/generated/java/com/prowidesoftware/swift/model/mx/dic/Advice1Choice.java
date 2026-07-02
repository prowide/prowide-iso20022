
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of a cancellation advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Advice1Choice", propOrder = {
    "ordrConfAdvcDtls",
    "stmtAdvcDtls"
})
public class Advice1Choice {

    @XmlElement(name = "OrdrConfAdvcDtls")
    protected List<InvestmentFundOrderExecution3> ordrConfAdvcDtls;
    @XmlElement(name = "StmtAdvcDtls")
    protected Statement9 stmtAdvcDtls;

    /**
     * Gets the value of the ordrConfAdvcDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrConfAdvcDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrConfAdvcDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrderExecution3 }
     * 
     * 
     */
    public List<InvestmentFundOrderExecution3> getOrdrConfAdvcDtls() {
        if (ordrConfAdvcDtls == null) {
            ordrConfAdvcDtls = new ArrayList<InvestmentFundOrderExecution3>();
        }
        return this.ordrConfAdvcDtls;
    }

    /**
     * Gets the value of the stmtAdvcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement9 }
     *     
     */
    public Statement9 getStmtAdvcDtls() {
        return stmtAdvcDtls;
    }

    /**
     * Sets the value of the stmtAdvcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement9 }
     *     
     */
    public Advice1Choice setStmtAdvcDtls(Statement9 value) {
        this.stmtAdvcDtls = value;
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

    /**
     * Adds a new item to the ordrConfAdvcDtls list.
     * @see #getOrdrConfAdvcDtls()
     * 
     */
    public Advice1Choice addOrdrConfAdvcDtls(InvestmentFundOrderExecution3 ordrConfAdvcDtls) {
        getOrdrConfAdvcDtls().add(ordrConfAdvcDtls);
        return this;
    }

}
