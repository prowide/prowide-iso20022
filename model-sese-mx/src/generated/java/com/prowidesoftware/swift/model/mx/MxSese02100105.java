
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.021.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxStsQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.021.001.05")
public class MxSese02100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxStsQry", required = true)
    protected SecuritiesTransactionStatusQueryV05 sctiesTxStsQry;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DocumentNumber16 .class, DocumentNumber5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification26 .class, MxSese02100105 .class, PartyIdentification127Choice.class, PartyIdentification144 .class, SecuritiesAccount22 .class, SecuritiesTransactionStatusQueryV05 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.021.001.05";

    public MxSese02100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02100105(final String xml) {
        this();
        MxSese02100105 tmp = parse(xml);
        sctiesTxStsQry = tmp.getSctiesTxStsQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxStsQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionStatusQueryV05 }
     *     
     */
    public SecuritiesTransactionStatusQueryV05 getSctiesTxStsQry() {
        return sctiesTxStsQry;
    }

    /**
     * Sets the value of the sctiesTxStsQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionStatusQueryV05 }
     *     
     */
    public MxSese02100105 setSctiesTxStsQry(SecuritiesTransactionStatusQueryV05 value) {
        this.sctiesTxStsQry = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese02100105 parse(String xml) {
        return ((MxSese02100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02100105 parse(String xml, MxRead parserImpl) {
        return ((MxSese02100105) parserImpl.read(MxSese02100105 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese02100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02100105 message
     * @return
     *     a new instance of MxSese02100105
     */
    public final static MxSese02100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02100105 .class);
    }

}
