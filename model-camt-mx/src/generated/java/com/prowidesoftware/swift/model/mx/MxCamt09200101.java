
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.092.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cshSttlmInitnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.092.001.01")
public class MxCamt09200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CshSttlmInitnStsAdvc", required = true)
    protected CashSettlementInitiationStatusAdviceV01 cshSttlmInitnStsAdvc;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 92;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashAccount24 .class, CashAccountType2Choice.class, CashSettlementInitiationStatusAdviceV01 .class, CashSettlementStatus1Code.class, GenericAccountIdentification1 .class, MxCamt09200101 .class, OriginalBusinessQuery1 .class, SettlementInstructionStatus1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1camt.092.001.01";

    public MxCamt09200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt09200101(final String xml) {
        this();
        MxCamt09200101 tmp = parse(xml);
        cshSttlmInitnStsAdvc = tmp.getCshSttlmInitnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt09200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cshSttlmInitnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementInitiationStatusAdviceV01 }
     *     
     */
    public CashSettlementInitiationStatusAdviceV01 getCshSttlmInitnStsAdvc() {
        return cshSttlmInitnStsAdvc;
    }

    /**
     * Sets the value of the cshSttlmInitnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementInitiationStatusAdviceV01 }
     *     
     */
    public MxCamt09200101 setCshSttlmInitnStsAdvc(CashSettlementInitiationStatusAdviceV01 value) {
        this.cshSttlmInitnStsAdvc = value;
        return this;
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
    public static MxCamt09200101 parse(String xml) {
        return ((MxCamt09200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt09200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt09200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt09200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt09200101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt09200101) parserImpl.read(MxCamt09200101 .class, xml, _classes));
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
     * Creates an MxCamt09200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt09200101 message
     * @return
     *     a new instance of MxCamt09200101
     */
    public static final MxCamt09200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt09200101 .class);
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
