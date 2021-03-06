package com.exampleariba.aribasoup.gerado;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.5.2.0
//
// Created by Quasar Development 
//
//---------------------------------------------------



import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.*;
import org.kxml2.io.KXmlParser;
import org.kxml2.kdom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Vector;
import java.io.StringReader;
import java.io.StringWriter;

//If you have a compilation error here then you have to add a reference to ExKsoap2.jar to your project (you can find it in Libs folder in the generated zip file)
public class QBSExtendedSoapSerializationEnvelope extends com.easywsdl.exksoap2.serialization.ExSoapSerializationEnvelope {
    static HashMap< java.lang.String,java.lang.Class> classNames = new HashMap< java.lang.String, java.lang.Class>();
    
    static {
        classNames.put("http://ariba.com/xi/SupplierManagement^^PollingRequest",QBSPollingRequest.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BusinessDocumentMessageHeader",QBSBusinessDocumentMessageHeader.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BusinessDocumentMessageHeaderParty",QBSBusinessDocumentMessageHeaderParty.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BusinessDocumentMessageHeaderPartyContactPerson",QBSBusinessDocumentMessageHeaderPartyContactPerson.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^PhoneNumber",QBSPhoneNumber.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BusinessScope",QBSBusinessScope.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^PollingRequestDetails",QBSPollingRequestDetails.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^PollingMessage",QBSPollingMessage.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITEBulkRplctReqMsg",QBSBPSUITEBulkRplctReqMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqMsg",QBSBPSUITERplctReqMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqBP",QBSBPSUITERplctReqBP.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustInfo",QBSBPSUITERplctReqCustInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqSalesAndDistrBlocks",QBSBPSUITERplctReqSalesAndDistrBlocks.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustIndstrySectr",QBSBPSUITERplctReqCustIndstrySectr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqMktgAttribs",QBSBPSUITERplctReqMktgAttribs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqLegalCtrlInds",QBSBPSUITERplctReqLegalCtrlInds.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqPrSpecs",QBSBPSUITERplctReqPrSpecs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustAcctgInfo",QBSBPSUITERplctReqCustAcctgInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^GeneralLedgerAccountReference",QBSGeneralLedgerAccountReference.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqDunInfo",QBSBPSUITERplctReqDunInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustWhldgTx",QBSBPSUITERplctReqCustWhldgTx.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^CLOSED_DatePeriod",QBSCLOSED_DatePeriod.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqText",QBSBPSUITERplctReqText.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqTextSAPScriptLine",QBSBPSUITERplctReqTextSAPScriptLine.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqSlsArrgmt",QBSBPSUITERplctReqSlsArrgmt.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqDelivTrms",QBSBPSUITERplctReqDelivTrms.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^Incoterms",QBSIncoterms.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^QuantityTolerance",QBSQuantityTolerance.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustPartFuncs",QBSBPSUITERplctReqCustPartFuncs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustUnldgPts",QBSBPSUITERplctReqCustUnldgPts.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqBusHrs",QBSBPSUITERplctReqBusHrs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustTaxClass",QBSBPSUITERplctReqCustTaxClass.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCustTxGrpg",QBSBPSUITERplctReqCustTxGrpg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqTxExmp",QBSBPSUITERplctReqTxExmp.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqDoc",QBSBPSUITERplctReqDoc.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqSuplr",QBSBPSUITERplctReqSuplr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAcctgInfo",QBSBPSUITERplctReqAcctgInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqWhldgTx",QBSBPSUITERplctReqWhldgTx.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqBiddingCharc",QBSBPSUITERplctReqBiddingCharc.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqProcmtCardIssuingInstitutes",QBSBPSUITERplctReqProcmtCardIssuingInstitutes.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqQltyMgmt",QBSBPSUITERplctReqQltyMgmt.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqProcmtArrgmt",QBSBPSUITERplctReqProcmtArrgmt.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqPurgTrms",QBSBPSUITERplctReqPurgTrms.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqPartFuncs",QBSBPSUITERplctReqPartFuncs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqSubRnge",QBSBPSUITERplctReqSubRnge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqTxGrpg",QBSBPSUITERplctReqTxGrpg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfo",QBSBPSUITERplctReqAddrInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrUsge",QBSBPSUITERplctReqAddrInfoAddrUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddr",QBSBPSUITERplctReqAddrInfoAddr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqNote",QBSBPSUITERplctReqNote.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrCommPref",QBSBPSUITERplctReqAddrInfoAddrCommPref.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrEml",QBSBPSUITERplctReqAddrInfoAddrEml.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrEmlUsge",QBSBPSUITERplctReqAddrInfoAddrEmlUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^CommunicationAddressUsage",QBSCommunicationAddressUsage.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrFacs",QBSBPSUITERplctReqAddrInfoAddrFacs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrFacsUsge",QBSBPSUITERplctReqAddrInfoAddrFacsUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrOrgName",QBSBPSUITERplctReqAddrInfoAddrOrgName.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^OrganisationName",QBSOrganisationName.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrPersnName",QBSBPSUITERplctReqAddrInfoAddrPersnName.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^PersonName",QBSPersonName.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrPostlAddr",QBSBPSUITERplctReqAddrInfoAddrPostlAddr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrTel",QBSBPSUITERplctReqAddrInfoAddrTel.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrTelUsge",QBSBPSUITERplctReqAddrInfoAddrTelUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrWeb",QBSBPSUITERplctReqAddrInfoAddrWeb.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqAddrInfoAddrWebUsge",QBSBPSUITERplctReqAddrInfoAddrWebUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqBkDets",QBSBPSUITERplctReqBkDets.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqBkDetsBkDirRef",QBSBPSUITERplctReqBkDetsBkDirRef.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqCom",QBSBPSUITERplctReqCom.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqComPersn",QBSBPSUITERplctReqComPersn.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqComOrg",QBSBPSUITERplctReqComOrg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqComGrp",QBSBPSUITERplctReqComGrp.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqRole",QBSBPSUITERplctReqRole.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqIdn",QBSBPSUITERplctReqIdn.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqIndstrySectr",QBSBPSUITERplctReqIndstrySectr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctReqTxNo",QBSBPSUITERplctReqTxNo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITEBulkRplctConfMsg",QBSBPSUITEBulkRplctConfMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctConfMsg",QBSBPSUITERplctConfMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctConfBP",QBSBPSUITERplctConfBP.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctConfCust",QBSBPSUITERplctConfCust.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPSUITERplctConfSuplr",QBSBPSUITERplctConfSuplr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^Log",QBSLog.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^LogItem",QBSLogItem.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^LogItemNotePlaceholderSubstitutionList",QBSLogItemNotePlaceholderSubstitutionList.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITEBulkRplctReqMsg",QBSBPRelshpSUITEBulkRplctReqMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqMsg",QBSBPRelshpSUITERplctReqMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqBPRelshp",QBSBPRelshpSUITERplctReqBPRelshp.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersn",QBSBPRelshpSUITERplctReqCntctPersn.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfo",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfo.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrCommPref.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEml.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrEmlUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacs.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacsUsge",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrFacsUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTel.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTelUsge",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrTelUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWeb.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWebUsge",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWebUsge.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrRpstPersnName.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc",QBSBPRelshpSUITERplctReqCntctPersnWplcAddrInfoAddrWplc.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqCustSuplrCntctPersn",QBSBPRelshpSUITERplctReqCustSuplrCntctPersn.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctReqShrhldr",QBSBPRelshpSUITERplctReqShrhldr.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITEBulkRplctConfMsg",QBSBPRelshpSUITEBulkRplctConfMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctConfMsg",QBSBPRelshpSUITERplctConfMsg.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^BPRelshpSUITERplctConfBPRelshp",QBSBPRelshpSUITERplctConfBPRelshp.class);
        classNames.put("http://ariba.com/xi/SupplierManagement^^PollingResponse",QBSPollingResponse.class);
    } 


    protected static final int QNAME_NAMESPACE = 0;
    private static final String TYPE_LABEL = "type";

    public QBSExtendedSoapSerializationEnvelope() {
        this(SoapEnvelope.VER11);
    }

    public QBSExtendedSoapSerializationEnvelope(int soapVersion) {
        super(soapVersion);
        implicitTypes = true;
        setAddAdornments(false);
        new QBSMarshalGuid().register(this);
        new MarshalFloat().register(this);
    }

    

    @Override
    protected void writeProperty(XmlSerializer writer, java.lang.Object obj, PropertyInfo type) throws IOException {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if (obj == null || obj== SoapPrimitive.NullNilElement) {
            writer.attribute(xsi, version >= VER12 ? NIL_LABEL : NULL_LABEL, "true");
            return;
        }
        if(writeReferenceObject(writer,obj))
        {
            return;
        }
        java.lang.Object[] qName = getInfo(null, obj);
        if (!type.multiRef && qName[2] == null )
        {

            if (!implicitTypes || (obj.getClass() != type.type && !(obj instanceof Vector ) && type.type!=java.lang.String.class  )) {
                java.lang.String xmlName=QBSHelper.getKeyByValue(classNames,obj.getClass());
                if(xmlName!=null) {
                    java.lang.String[] parts = xmlName.split("\\^\\^");
                    java.lang.String prefix = writer.getPrefix(parts[0], true);
                    writer.attribute(xsi, TYPE_LABEL, prefix + ":" + parts[1]);
                }
                else
                {
                    if(type.type instanceof String) {
                        java.lang.String xsdPrefix = writer.getPrefix(xsd, true);
                        java.lang.String myType = (java.lang.String) type.type;
                        java.lang.String[] parts = myType.split("\\^\\^");
                        if (parts.length == 2) {
                            xsdPrefix = writer.getPrefix(parts[0], true);
                            myType = parts[1];
                        }

                        writer.attribute(xsi, TYPE_LABEL, xsdPrefix + ":" + myType);
                    }
                    else
                    {
                        java.lang.String prefix = writer.getPrefix(type.namespace, true);
                        writer.attribute(xsi, TYPE_LABEL, prefix + ":" + obj.getClass().getSimpleName());
                    }

                }
            }
            //super.writeProperty(writer,obj,type);

            //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
            //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
            writeElement(writer, obj, type, qName[QNAME_MARSHAL]);
        }
        else {
            super.writeProperty(writer, obj, type);
        }
    }
    public SoapObject GetExceptionDetail(Element detailElement,java.lang.String exceptionElementNS,java.lang.String exceptionElementName)
    {
        int index=detailElement.indexOf(exceptionElementNS,exceptionElementName,0);
        if(index>-1)
        {
            Element errorElement=detailElement.getElement(index);
            return GetSoapObject(errorElement);
        }
        return null;
    }

    public SoapObject GetSoapObject(Element detailElement) {
        try{
            XmlSerializer xmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter writer = new StringWriter();
            xmlSerializer.setOutput(writer);
            detailElement.write(xmlSerializer);
            xmlSerializer.flush();

            XmlPullParser xpp = new KXmlParser();
            xpp.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);

            xpp.setInput(new StringReader(writer.toString()));
            xpp.nextTag();
            SoapObject soapObj = new SoapObject(detailElement.getNamespace(),detailElement.getName());
            readSerializable(xpp,soapObj);
            return soapObj;
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

    public java.lang.Object GetHeader(Element detailElement) {
        if(detailElement.getChildCount()>0 && detailElement.getText(0)!=null)
        {
            SoapPrimitive primitive = new SoapPrimitive(detailElement.getNamespace(),detailElement.getName(),detailElement.getText(0));
            return  primitive;
        }
    
        return GetSoapObject(detailElement);
    }

    private Object createObject(Object soap, Class cl) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Object obj=cl.newInstance();
        Method ctor = obj.getClass().getMethod("loadFromSoap",Object.class,QBSExtendedSoapSerializationEnvelope.class);
        ctor.invoke(obj,soap,this);
        return obj;
    }

    public java.lang.Object get(java.lang.Object soap,java.lang.Class cl,boolean typeFromClass)
    {
        if(soap==null)
        {
            return null;
        }
        try
        {
            if(typeFromClass)
            {
                return createObject(soap, cl);
            }
            java.lang.Object refAttr=getReference(soap);
            if (refAttr != null)
            {
                return refAttr;
            }
            else
            {
                if(soap instanceof SoapObject)
                {
                    if(cl ==SoapObject.class)
                    {
                        return soap;
                    }
                    java.lang.String key=String.format("%s^^%s",((SoapObject)soap).getNamespace(),((SoapObject)soap).getName());
                    if(classNames.containsKey(key))
                    {
                        cl=classNames.get(key);
                    }
                }
                return createObject(soap, cl);
            }
        }
        catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    public java.lang.Object getSpecificType(java.lang.Object obj)
    {
        if(obj==null)
        {
            return null;
        }
        if(obj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)obj;
            java.lang.String key=soapObject.getNamespace()+"^^"+soapObject.getName();
            if(classNames.containsKey(key))
            {
                java.lang.Class cl=classNames.get(key);
                try
                {
                    return createObject(soapObject, cl);
                } 
                catch (java.lang.Exception e)
                {
                    e.printStackTrace();
                }
            }
        }

        return obj;
    }

    public static java.lang.Object getXSDType(java.lang.Object param)
    {
        if(param==null)
        {
            return null;
        }
        java.lang.Class obj=param.getClass();
        if(obj.equals(java.lang.String.class))
        {
            return "string";
        }
        if(obj.equals(int.class) || obj.equals(java.lang.Integer.class))
        {
            return "int";
        }
        if(obj.equals(float.class) || obj.equals(java.lang.Float.class))
        {
            return "float";
        }
        if(obj.equals(double.class) || obj.equals(java.lang.Double.class))
        {
            return "double";
        }
        if(obj.equals(java.math.BigDecimal.class))
        {
            return "decimal";
        }
        if(obj.equals(short.class) || obj.equals(java.lang.Short.class))
        {
            return "short";
        }
        if(obj.equals(long.class) || obj.equals(java.lang.Long.class))
        {
            return "long";
        }
        if(obj.equals(boolean.class) || obj.equals(java.lang.Boolean.class))
        {
            return "boolean";
        }
        java.lang.String xmlName=QBSHelper.getKeyByValue(classNames,obj);
        if(xmlName==null)
        {
            return obj;
        }
        return xmlName;
    }
} 

