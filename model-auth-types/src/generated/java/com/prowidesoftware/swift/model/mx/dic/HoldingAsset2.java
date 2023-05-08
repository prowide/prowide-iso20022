
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
 * Information on the assets held by the money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingAsset2", propOrder = {
    "mnyMktInstrmHldg",
    "scrtstnAsstBckdComrclPprHldg",
    "derivHldg",
    "mnyMktFndHldgInf",
    "dpstAncllryLqdAsstHldg",
    "rpAgrmtHldg"
})
public class HoldingAsset2 {

    @XmlElement(name = "MnyMktInstrmHldg")
    protected List<Financialinstrument78> mnyMktInstrmHldg;
    @XmlElement(name = "ScrtstnAsstBckdComrclPprHldg")
    protected List<Financialinstrument78> scrtstnAsstBckdComrclPprHldg;
    @XmlElement(name = "DerivHldg")
    protected List<Financialinstrument78> derivHldg;
    @XmlElement(name = "MnyMktFndHldgInf")
    protected List<Financialinstrument78> mnyMktFndHldgInf;
    @XmlElement(name = "DpstAncllryLqdAsstHldg")
    protected List<Financialinstrument78> dpstAncllryLqdAsstHldg;
    @XmlElement(name = "RpAgrmtHldg")
    protected List<Financialinstrument78> rpAgrmtHldg;

    /**
     * Gets the value of the mnyMktInstrmHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mnyMktInstrmHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnyMktInstrmHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the mnyMktInstrmHldg property.
     */
    public List<Financialinstrument78> getMnyMktInstrmHldg() {
        if (mnyMktInstrmHldg == null) {
            mnyMktInstrmHldg = new ArrayList<>();
        }
        return this.mnyMktInstrmHldg;
    }

    /**
     * Gets the value of the scrtstnAsstBckdComrclPprHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scrtstnAsstBckdComrclPprHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrtstnAsstBckdComrclPprHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the scrtstnAsstBckdComrclPprHldg property.
     */
    public List<Financialinstrument78> getScrtstnAsstBckdComrclPprHldg() {
        if (scrtstnAsstBckdComrclPprHldg == null) {
            scrtstnAsstBckdComrclPprHldg = new ArrayList<>();
        }
        return this.scrtstnAsstBckdComrclPprHldg;
    }

    /**
     * Gets the value of the derivHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the derivHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the derivHldg property.
     */
    public List<Financialinstrument78> getDerivHldg() {
        if (derivHldg == null) {
            derivHldg = new ArrayList<>();
        }
        return this.derivHldg;
    }

    /**
     * Gets the value of the mnyMktFndHldgInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mnyMktFndHldgInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMnyMktFndHldgInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the mnyMktFndHldgInf property.
     */
    public List<Financialinstrument78> getMnyMktFndHldgInf() {
        if (mnyMktFndHldgInf == null) {
            mnyMktFndHldgInf = new ArrayList<>();
        }
        return this.mnyMktFndHldgInf;
    }

    /**
     * Gets the value of the dpstAncllryLqdAsstHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dpstAncllryLqdAsstHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpstAncllryLqdAsstHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the dpstAncllryLqdAsstHldg property.
     */
    public List<Financialinstrument78> getDpstAncllryLqdAsstHldg() {
        if (dpstAncllryLqdAsstHldg == null) {
            dpstAncllryLqdAsstHldg = new ArrayList<>();
        }
        return this.dpstAncllryLqdAsstHldg;
    }

    /**
     * Gets the value of the rpAgrmtHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rpAgrmtHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpAgrmtHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financialinstrument78 }
     * 
     * 
     * @return
     *     The value of the rpAgrmtHldg property.
     */
    public List<Financialinstrument78> getRpAgrmtHldg() {
        if (rpAgrmtHldg == null) {
            rpAgrmtHldg = new ArrayList<>();
        }
        return this.rpAgrmtHldg;
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
     * Adds a new item to the mnyMktInstrmHldg list.
     * @see #getMnyMktInstrmHldg()
     * 
     */
    public HoldingAsset2 addMnyMktInstrmHldg(Financialinstrument78 mnyMktInstrmHldg) {
        getMnyMktInstrmHldg().add(mnyMktInstrmHldg);
        return this;
    }

    /**
     * Adds a new item to the scrtstnAsstBckdComrclPprHldg list.
     * @see #getScrtstnAsstBckdComrclPprHldg()
     * 
     */
    public HoldingAsset2 addScrtstnAsstBckdComrclPprHldg(Financialinstrument78 scrtstnAsstBckdComrclPprHldg) {
        getScrtstnAsstBckdComrclPprHldg().add(scrtstnAsstBckdComrclPprHldg);
        return this;
    }

    /**
     * Adds a new item to the derivHldg list.
     * @see #getDerivHldg()
     * 
     */
    public HoldingAsset2 addDerivHldg(Financialinstrument78 derivHldg) {
        getDerivHldg().add(derivHldg);
        return this;
    }

    /**
     * Adds a new item to the mnyMktFndHldgInf list.
     * @see #getMnyMktFndHldgInf()
     * 
     */
    public HoldingAsset2 addMnyMktFndHldgInf(Financialinstrument78 mnyMktFndHldgInf) {
        getMnyMktFndHldgInf().add(mnyMktFndHldgInf);
        return this;
    }

    /**
     * Adds a new item to the dpstAncllryLqdAsstHldg list.
     * @see #getDpstAncllryLqdAsstHldg()
     * 
     */
    public HoldingAsset2 addDpstAncllryLqdAsstHldg(Financialinstrument78 dpstAncllryLqdAsstHldg) {
        getDpstAncllryLqdAsstHldg().add(dpstAncllryLqdAsstHldg);
        return this;
    }

    /**
     * Adds a new item to the rpAgrmtHldg list.
     * @see #getRpAgrmtHldg()
     * 
     */
    public HoldingAsset2 addRpAgrmtHldg(Financialinstrument78 rpAgrmtHldg) {
        getRpAgrmtHldg().add(rpAgrmtHldg);
        return this;
    }

}
