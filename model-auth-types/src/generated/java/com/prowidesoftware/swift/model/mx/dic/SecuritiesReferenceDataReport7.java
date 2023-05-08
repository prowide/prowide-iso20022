
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
 * Provides details on the securities reference data for the required financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDataReport7", propOrder = {
    "techRcrdId",
    "finInstrmGnlAttrbts",
    "issr",
    "tradgVnRltdAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts",
    "techAttrbts"
})
public class SecuritiesReferenceDataReport7 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription17 finInstrmGnlAttrbts;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "TradgVnRltdAttrbts", required = true)
    protected List<TradingVenueAttributes2> tradgVnRltdAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument2 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts")
    protected DerivativeInstrument5 derivInstrmAttrbts;
    @XmlElement(name = "TechAttrbts")
    protected RecordTechnicalData4 techAttrbts;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesReferenceDataReport7 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmGnlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription17 }
     *     
     */
    public SecurityInstrumentDescription17 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Sets the value of the finInstrmGnlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription17 }
     *     
     */
    public SecuritiesReferenceDataReport7 setFinInstrmGnlAttrbts(SecurityInstrumentDescription17 value) {
        this.finInstrmGnlAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesReferenceDataReport7 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the tradgVnRltdAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgVnRltdAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgVnRltdAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingVenueAttributes2 }
     * 
     * 
     * @return
     *     The value of the tradgVnRltdAttrbts property.
     */
    public List<TradingVenueAttributes2> getTradgVnRltdAttrbts() {
        if (tradgVnRltdAttrbts == null) {
            tradgVnRltdAttrbts = new ArrayList<>();
        }
        return this.tradgVnRltdAttrbts;
    }

    /**
     * Gets the value of the debtInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument2 }
     *     
     */
    public DebtInstrument2 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Sets the value of the debtInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument2 }
     *     
     */
    public SecuritiesReferenceDataReport7 setDebtInstrmAttrbts(DebtInstrument2 value) {
        this.debtInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the derivInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument5 }
     *     
     */
    public DerivativeInstrument5 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Sets the value of the derivInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument5 }
     *     
     */
    public SecuritiesReferenceDataReport7 setDerivInstrmAttrbts(DerivativeInstrument5 value) {
        this.derivInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTechnicalData4 }
     *     
     */
    public RecordTechnicalData4 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTechnicalData4 }
     *     
     */
    public SecuritiesReferenceDataReport7 setTechAttrbts(RecordTechnicalData4 value) {
        this.techAttrbts = value;
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
     * Adds a new item to the tradgVnRltdAttrbts list.
     * @see #getTradgVnRltdAttrbts()
     * 
     */
    public SecuritiesReferenceDataReport7 addTradgVnRltdAttrbts(TradingVenueAttributes2 tradgVnRltdAttrbts) {
        getTradgVnRltdAttrbts().add(tradgVnRltdAttrbts);
        return this;
    }

}
