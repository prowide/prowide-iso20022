
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
 * The DTCCCAINSD1 message extends ISO corporate action instruction message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAINSD1V07", propOrder = {
    "optnlDvdd",
    "taxXmpt",
    "taxCtgy",
    "wireInstr",
    "reorgInstrDtls"
})
public class DTCCCAINSD1V07 {

    @XmlElement(name = "OptnlDvdd")
    protected List<OptionalDividendAccountQuantitySD3> optnlDvdd;
    @XmlElement(name = "TaxXmpt")
    protected List<TaxExemptQuantitySD2> taxXmpt;
    @XmlElement(name = "TaxCtgy")
    protected List<TaxCategory2> taxCtgy;
    @XmlElement(name = "WireInstr")
    protected List<WireInstructionSD3> wireInstr;
    @XmlElement(name = "ReorgInstrDtls")
    protected ReorganisationInstructionSD13 reorgInstrDtls;

    /**
     * Gets the value of the optnlDvdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnlDvdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnlDvdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalDividendAccountQuantitySD3 }
     * 
     * 
     * @return
     *     The value of the optnlDvdd property.
     */
    public List<OptionalDividendAccountQuantitySD3> getOptnlDvdd() {
        if (optnlDvdd == null) {
            optnlDvdd = new ArrayList<>();
        }
        return this.optnlDvdd;
    }

    /**
     * Gets the value of the taxXmpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxXmpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxXmpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptQuantitySD2 }
     * 
     * 
     * @return
     *     The value of the taxXmpt property.
     */
    public List<TaxExemptQuantitySD2> getTaxXmpt() {
        if (taxXmpt == null) {
            taxXmpt = new ArrayList<>();
        }
        return this.taxXmpt;
    }

    /**
     * Gets the value of the taxCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategory2 }
     * 
     * 
     * @return
     *     The value of the taxCtgy property.
     */
    public List<TaxCategory2> getTaxCtgy() {
        if (taxCtgy == null) {
            taxCtgy = new ArrayList<>();
        }
        return this.taxCtgy;
    }

    /**
     * Gets the value of the wireInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wireInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireInstructionSD3 }
     * 
     * 
     * @return
     *     The value of the wireInstr property.
     */
    public List<WireInstructionSD3> getWireInstr() {
        if (wireInstr == null) {
            wireInstr = new ArrayList<>();
        }
        return this.wireInstr;
    }

    /**
     * Gets the value of the reorgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationInstructionSD13 }
     *     
     */
    public ReorganisationInstructionSD13 getReorgInstrDtls() {
        return reorgInstrDtls;
    }

    /**
     * Sets the value of the reorgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationInstructionSD13 }
     *     
     */
    public DTCCCAINSD1V07 setReorgInstrDtls(ReorganisationInstructionSD13 value) {
        this.reorgInstrDtls = value;
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
     * Adds a new item to the optnlDvdd list.
     * @see #getOptnlDvdd()
     * 
     */
    public DTCCCAINSD1V07 addOptnlDvdd(OptionalDividendAccountQuantitySD3 optnlDvdd) {
        getOptnlDvdd().add(optnlDvdd);
        return this;
    }

    /**
     * Adds a new item to the taxXmpt list.
     * @see #getTaxXmpt()
     * 
     */
    public DTCCCAINSD1V07 addTaxXmpt(TaxExemptQuantitySD2 taxXmpt) {
        getTaxXmpt().add(taxXmpt);
        return this;
    }

    /**
     * Adds a new item to the taxCtgy list.
     * @see #getTaxCtgy()
     * 
     */
    public DTCCCAINSD1V07 addTaxCtgy(TaxCategory2 taxCtgy) {
        getTaxCtgy().add(taxCtgy);
        return this;
    }

    /**
     * Adds a new item to the wireInstr list.
     * @see #getWireInstr()
     * 
     */
    public DTCCCAINSD1V07 addWireInstr(WireInstructionSD3 wireInstr) {
        getWireInstr().add(wireInstr);
        return this;
    }

}
