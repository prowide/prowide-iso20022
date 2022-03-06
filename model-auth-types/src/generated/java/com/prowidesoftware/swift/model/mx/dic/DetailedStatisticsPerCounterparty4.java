
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed information on statistics per combination of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedStatisticsPerCounterparty4", propOrder = {
    "refDt",
    "ctrPtyId",
    "rcncltnSttstcs",
    "cmptntAuthrty"
})
public class DetailedStatisticsPerCounterparty4 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "CtrPtyId", required = true)
    protected TradeCounterpartyReport9 ctrPtyId;
    @XmlElement(name = "RcncltnSttstcs", required = true)
    protected ReconciliationStatisticsPerDerivativeContractGroup2 rcncltnSttstcs;
    @XmlElement(name = "CmptntAuthrty")
    protected List<CompetentAuthority1> cmptntAuthrty;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedStatisticsPerCounterparty4 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public TradeCounterpartyReport9 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public DetailedStatisticsPerCounterparty4 setCtrPtyId(TradeCounterpartyReport9 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationStatisticsPerDerivativeContractGroup2 }
     *     
     */
    public ReconciliationStatisticsPerDerivativeContractGroup2 getRcncltnSttstcs() {
        return rcncltnSttstcs;
    }

    /**
     * Sets the value of the rcncltnSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationStatisticsPerDerivativeContractGroup2 }
     *     
     */
    public DetailedStatisticsPerCounterparty4 setRcncltnSttstcs(ReconciliationStatisticsPerDerivativeContractGroup2 value) {
        this.rcncltnSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmptntAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmptntAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetentAuthority1 }
     * 
     * 
     */
    public List<CompetentAuthority1> getCmptntAuthrty() {
        if (cmptntAuthrty == null) {
            cmptntAuthrty = new ArrayList<CompetentAuthority1>();
        }
        return this.cmptntAuthrty;
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
     * Adds a new item to the cmptntAuthrty list.
     * @see #getCmptntAuthrty()
     * 
     */
    public DetailedStatisticsPerCounterparty4 addCmptntAuthrty(CompetentAuthority1 cmptntAuthrty) {
        getCmptntAuthrty().add(cmptntAuthrty);
        return this;
    }

}
