
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
 * The DTCCCAINSD1 message extends ISO corporate action instruction message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAINSD1V04", propOrder = {
    "optnlDvdd",
    "taxXmpt",
    "wireInstr",
    "reorgInstrDtls"
})
public class DTCCCAINSD1V04 {

    @XmlElement(name = "OptnlDvdd")
    protected List<OptionalDividendAccountQuantitySD3> optnlDvdd;
    @XmlElement(name = "TaxXmpt")
    protected List<TaxExemptQuantitySD2> taxXmpt;
    @XmlElement(name = "WireInstr")
    protected List<WireInstructionSD3> wireInstr;
    @XmlElement(name = "ReorgInstrDtls")
    protected List<ReorganisationInstructionDetailsSD1> reorgInstrDtls;

    /**
     * Gets the value of the optnlDvdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnlDvdd property.
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
     */
    public List<OptionalDividendAccountQuantitySD3> getOptnlDvdd() {
        if (optnlDvdd == null) {
            optnlDvdd = new ArrayList<OptionalDividendAccountQuantitySD3>();
        }
        return this.optnlDvdd;
    }

    /**
     * Gets the value of the taxXmpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxXmpt property.
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
     */
    public List<TaxExemptQuantitySD2> getTaxXmpt() {
        if (taxXmpt == null) {
            taxXmpt = new ArrayList<TaxExemptQuantitySD2>();
        }
        return this.taxXmpt;
    }

    /**
     * Gets the value of the wireInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireInstr property.
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
     */
    public List<WireInstructionSD3> getWireInstr() {
        if (wireInstr == null) {
            wireInstr = new ArrayList<WireInstructionSD3>();
        }
        return this.wireInstr;
    }

    /**
     * Gets the value of the reorgInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reorgInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReorgInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReorganisationInstructionDetailsSD1 }
     * 
     * 
     */
    public List<ReorganisationInstructionDetailsSD1> getReorgInstrDtls() {
        if (reorgInstrDtls == null) {
            reorgInstrDtls = new ArrayList<ReorganisationInstructionDetailsSD1>();
        }
        return this.reorgInstrDtls;
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
    public DTCCCAINSD1V04 addOptnlDvdd(OptionalDividendAccountQuantitySD3 optnlDvdd) {
        getOptnlDvdd().add(optnlDvdd);
        return this;
    }

    /**
     * Adds a new item to the taxXmpt list.
     * @see #getTaxXmpt()
     * 
     */
    public DTCCCAINSD1V04 addTaxXmpt(TaxExemptQuantitySD2 taxXmpt) {
        getTaxXmpt().add(taxXmpt);
        return this;
    }

    /**
     * Adds a new item to the wireInstr list.
     * @see #getWireInstr()
     * 
     */
    public DTCCCAINSD1V04 addWireInstr(WireInstructionSD3 wireInstr) {
        getWireInstr().add(wireInstr);
        return this;
    }

    /**
     * Adds a new item to the reorgInstrDtls list.
     * @see #getReorgInstrDtls()
     * 
     */
    public DTCCCAINSD1V04 addReorgInstrDtls(ReorganisationInstructionDetailsSD1 reorgInstrDtls) {
        getReorgInstrDtls().add(reorgInstrDtls);
        return this;
    }

}
