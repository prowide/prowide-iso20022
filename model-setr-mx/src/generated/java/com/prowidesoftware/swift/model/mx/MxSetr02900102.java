
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
 * Class for setr.029.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConfCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.029.001.02")
public class MxSetr02900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConfCxl", required = true)
    protected SecuritiesTradeConfirmationCancellationV02 sctiesTradConfCxl;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AlternatePartyIdentification10 .class, AlternatePartyIdentification8 .class, CashAccountIdentification5Choice.class, DocumentNumber17Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationReference8Choice.class, IdentificationType42Choice.class, IdentificationType43Choice.class, Linkages52 .class, MxSetr02900102 .class, NameAndAddress13 .class, NameAndAddress5 .class, OtherParties45 .class, PartyIdentification240Choice.class, PartyIdentification245Choice.class, PartyIdentificationAndAccount152 .class, PartyIdentificationAndAccount154 .class, PartyIdentificationAndAccount220 .class, PartyIdentificationAndAccount221 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress8 .class, SecuritiesTradeConfirmationCancellationV02 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactiontIdentification4 .class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.029.001.02";

    public MxSetr02900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02900102(final String xml) {
        this();
        MxSetr02900102 tmp = parse(xml);
        sctiesTradConfCxl = tmp.getSctiesTradConfCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConfCxl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationCancellationV02 }
     *     
     */
    public SecuritiesTradeConfirmationCancellationV02 getSctiesTradConfCxl() {
        return sctiesTradConfCxl;
    }

    /**
     * Sets the value of the sctiesTradConfCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationCancellationV02 }
     *     
     */
    public MxSetr02900102 setSctiesTradConfCxl(SecuritiesTradeConfirmationCancellationV02 value) {
        this.sctiesTradConfCxl = value;
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
    public static MxSetr02900102 parse(String xml) {
        return ((MxSetr02900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr02900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr02900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02900102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02900102) parserImpl.read(MxSetr02900102 .class, xml, _classes));
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
     * Creates an MxSetr02900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02900102 message
     * @return
     *     a new instance of MxSetr02900102
     */
    public static final MxSetr02900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr02900102 .class);
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
