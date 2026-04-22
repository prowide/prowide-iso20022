
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
 * Class for cafm.002.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileActnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafm.002.001.04")
public class MxCafm00200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FileActnRspn", required = true)
    protected FileActionResponseV04 fileActnRspn;
    public static final transient String BUSINESS_PROCESS = "cafm";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData3 .class, AcquirerData1 .class, AdditionalData1 .class, AdditionalFee4 .class, Address4 .class, Authority1 .class, CardData17 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardDataWriting2Code.class, Cardholder23 .class, CardholderName2 .class, CardholderVerificationCapability6Code.class, ContactPersonal2 .class, ContentInformationType41 .class, CorporateTaxType1Code.class, CorrectionIdentification1 .class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice6 .class, DestinationData1 .class, DeviceIdentification2 .class, DeviceIdentificationType2Code.class, DisplayCapabilities6 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, FileActionResponseV04 .class, FinancialInstitution10 .class, Frequency12Code.class, Header72 .class, IssuerData1 .class, Jurisdiction2 .class, LocalAddress1 .class, LocalAddress2 .class, LocalData10 .class, LocalData19 .class, LocalData20 .class, LocalData21 .class, LocalData24 .class, MACData1 .class, MxCafm00200104 .class, OnLineCapability2Code.class, OriginatorData2 .class, OutputFormat1Code.class, OutputFormat7Code.class, POIComponentType5Code.class, PayeeData1 .class, PayerData1 .class, PointOfInteractionComponent16 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, ReceiverData1 .class, Reconciliation5 .class, RiskAssessment1Code.class, SenderData1 .class, SettlementService7 .class, Software2 .class, SoftwareType2Code.class, StorageLocation2Code.class, Terminal10 .class, TerminalIntegrationCategory1Code.class, TerminalType2Code.class, Token4 .class, Token5 .class, UserInterface1Code.class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafm.002.001.04";

    public MxCafm00200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafm00200104(final String xml) {
        this();
        MxCafm00200104 tmp = parse(xml);
        fileActnRspn = tmp.getFileActnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafm00200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fileActnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionResponseV04 }
     *     
     */
    public FileActionResponseV04 getFileActnRspn() {
        return fileActnRspn;
    }

    /**
     * Sets the value of the fileActnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionResponseV04 }
     *     
     */
    public MxCafm00200104 setFileActnRspn(FileActionResponseV04 value) {
        this.fileActnRspn = value;
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
    public static MxCafm00200104 parse(String xml) {
        return ((MxCafm00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafm00200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafm00200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafm00200104 parse(String xml, MxRead parserImpl) {
        return ((MxCafm00200104) parserImpl.read(MxCafm00200104 .class, xml, _classes));
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
     * Creates an MxCafm00200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafm00200104 message
     * @return
     *     a new instance of MxCafm00200104
     */
    public static final MxCafm00200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafm00200104 .class);
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
