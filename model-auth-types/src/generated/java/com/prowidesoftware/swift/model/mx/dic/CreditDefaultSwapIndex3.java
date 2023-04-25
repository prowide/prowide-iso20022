
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Credit default swap derivative specific for reporting derivatives on a credit default swap index.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapIndex3", propOrder = {
    "undrlygIndxId",
    "undrlygIndxNm",
    "srs",
    "vrsn",
    "rollMnth",
    "nxtRollDt",
    "ntnlCcy"
})
public class CreditDefaultSwapIndex3 {

    @XmlElement(name = "UndrlygIndxId")
    protected String undrlygIndxId;
    @XmlElement(name = "UndrlygIndxNm")
    protected String undrlygIndxNm;
    @XmlElement(name = "Srs")
    protected BigDecimal srs;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "RollMnth")
    protected List<BigDecimal> rollMnth;
    @XmlElement(name = "NxtRollDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar nxtRollDt;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;

    /**
     * Gets the value of the undrlygIndxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygIndxId() {
        return undrlygIndxId;
    }

    /**
     * Sets the value of the undrlygIndxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapIndex3 setUndrlygIndxId(String value) {
        this.undrlygIndxId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygIndxNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygIndxNm() {
        return undrlygIndxNm;
    }

    /**
     * Sets the value of the undrlygIndxNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapIndex3 setUndrlygIndxNm(String value) {
        this.undrlygIndxNm = value;
        return this;
    }

    /**
     * Gets the value of the srs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrs() {
        return srs;
    }

    /**
     * Sets the value of the srs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditDefaultSwapIndex3 setSrs(BigDecimal value) {
        this.srs = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditDefaultSwapIndex3 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the rollMnth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rollMnth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollMnth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     * @return
     *     The value of the rollMnth property.
     */
    public List<BigDecimal> getRollMnth() {
        if (rollMnth == null) {
            rollMnth = new ArrayList<>();
        }
        return this.rollMnth;
    }

    /**
     * Gets the value of the nxtRollDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getNxtRollDt() {
        return nxtRollDt;
    }

    /**
     * Sets the value of the nxtRollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapIndex3 setNxtRollDt(Calendar value) {
        this.nxtRollDt = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapIndex3 setNtnlCcy(String value) {
        this.ntnlCcy = value;
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
     * Adds a new item to the rollMnth list.
     * @see #getRollMnth()
     * 
     */
    public CreditDefaultSwapIndex3 addRollMnth(BigDecimal rollMnth) {
        getRollMnth().add(rollMnth);
        return this;
    }

}
