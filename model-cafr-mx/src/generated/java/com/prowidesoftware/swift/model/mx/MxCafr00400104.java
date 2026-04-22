
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for cafr.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdDspstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.04")
public class MxCafr00400104
    extends AbstractMX
{

    @XmlElement(name = "FrdDspstnRspn", required = true)
    protected FraudDispositionResponseV04 frdDspstnRspn;
    public static final transient String BUSINESS_PROCESS = "cafr";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcquirerData1 .class, AdditionalFee4 .class, Address4 .class, Authority1 .class, CardData17 .class, Cardholder23 .class, CardholderName2 .class, ContactPersonal2 .class, ContentInformationType41 .class, Credentials3 .class, CreditDebit3Code.class, DestinationData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, ErrorDetails4 .class, FraudDispositionResponseV04 .class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LocalAddress1 .class, LocalAddress2 .class, LocalData20 .class, LocalData24 .class, MACData1 .class, MxCafr00400104 .class, OriginatorData2 .class, ProcessingResult30 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, ReceiverData1 .class, Reconciliation5 .class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, Token4 .class, Token5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.004.001.04";

    public MxCafr00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00400104(final String xml) {
        this();
        MxCafr00400104 tmp = parse(xml);
        frdDspstnRspn = tmp.getFrdDspstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdDspstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudDispositionResponseV04 }
     *     
     */
    public FraudDispositionResponseV04 getFrdDspstnRspn() {
        return frdDspstnRspn;
    }

    /**
     * Sets the value of the frdDspstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudDispositionResponseV04 }
     *     
     */
    public MxCafr00400104 setFrdDspstnRspn(FraudDispositionResponseV04 value) {
        this.frdDspstnRspn = value;
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
    public static MxCafr00400104 parse(String xml) {
        return ((MxCafr00400104) MxReadImpl.parse(MxCafr00400104 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00400104) MxReadImpl.parse(MxCafr00400104 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00400104 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00400104) parserImpl.read(MxCafr00400104 .class, xml, _classes));
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
     * Creates an MxCafr00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00400104 message
     * @return
     *     a new instance of MxCafr00400104
     */
    public static final MxCafr00400104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCafr00400104 .class);
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
