
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
 * Class for setr.029.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConfCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.029.001.01")
public class MxSetr02900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConfCxl", required = true)
    protected SecuritiesTradeConfirmationCancellationV01 sctiesTradConfCxl;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 29;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AlternatePartyIdentification5 .class, AlternatePartyIdentification6 .class, CashAccountIdentification2Choice.class, DocumentNumber4Choice.class, GenericIdentification1 .class, GenericIdentification29 .class, GenericIdentification38 .class, IdentificationReference8Choice.class, IdentificationType40Choice.class, IdentificationType41Choice.class, Linkages15 .class, MxSetr02900101 .class, NameAndAddress13 .class, NameAndAddress5 .class, OtherParties18 .class, PartyIdentification32Choice.class, PartyIdentification70Choice.class, PartyIdentificationAndAccount77 .class, PartyIdentificationAndAccount79 .class, PartyIdentificationAndAccount83 .class, PartyIdentificationAndAccount87 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress8 .class, SecuritiesTradeConfirmationCancellationV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactiontIdentification4 .class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.029.001.01";

    public MxSetr02900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02900101(final String xml) {
        this();
        MxSetr02900101 tmp = parse(xml);
        sctiesTradConfCxl = tmp.getSctiesTradConfCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConfCxl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationCancellationV01 }
     *     
     */
    public SecuritiesTradeConfirmationCancellationV01 getSctiesTradConfCxl() {
        return sctiesTradConfCxl;
    }

    /**
     * Sets the value of the sctiesTradConfCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationCancellationV01 }
     *     
     */
    public MxSetr02900101 setSctiesTradConfCxl(SecuritiesTradeConfirmationCancellationV01 value) {
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
    public static MxSetr02900101 parse(String xml) {
        return ((MxSetr02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr02900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr02900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02900101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02900101) parserImpl.read(MxSetr02900101 .class, xml, _classes));
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
     * Creates an MxSetr02900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02900101 message
     * @return
     *     a new instance of MxSetr02900101
     */
    public static final MxSetr02900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr02900101 .class);
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
